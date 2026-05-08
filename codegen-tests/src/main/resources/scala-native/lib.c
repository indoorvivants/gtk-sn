#include "lib.h"
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <glib.h>


void test_set_options(GImpl* self, int count, char* title, char** flags) {
    self->count = count;
    self->title = title;
    self->flags = flags;
}

char** test_get_flags(GImpl* self) {
    return self->flags;
}

char* test_get_title(GImpl* self) {
    return self->title;
}

int test_get_count(GImpl* self) {
    return self->count;
}

GImpl* test_new_from_count(gint count, GError** error) {
    if (count < 0) {
        char* err = "Number is negative";
        GQuark quark = g_quark_from_static_string(err);
        g_set_error (error,
                       quark,
                       0,
                       "Number is negative");
        return NULL;
    } else {
        GImpl* self = test_new();
        self->count = count;
        return self;
    }
}



int test_sqrt_count(GImpl* self, GError** error) {
    if (self->count < 0) {
        char* err = "Number is negative";
        GQuark quark = g_quark_from_static_string(err);
        g_set_error (error,
                       quark,
                       0,
                       "Number is negative");
        return -1;
    } else {
        return (int)sqrt(self->count);
    }
    return self->count;
}

// adds prefix to every single string in strings
char** test_concat_title(char* prefix, char** strings) {
    int n = 0;
    while (strings[n] != NULL) n++;

    char** result = malloc(sizeof(char*) * (n + 1));
    if (!result) return NULL;

    size_t prefix_len = strlen(prefix);

    for (int i = 0; i < n; i++) {
        size_t total = prefix_len + strlen(strings[i]) + 1;
        result[i] = malloc(total);
        if (!result[i]) {
            while (--i >= 0) free(result[i]);
            free(result);
            return NULL;
        }
        memcpy(result[i], prefix, prefix_len);
        strcpy(result[i] + prefix_len, strings[i]);
    }

    result[n] = NULL;
    return result;
}

GImpl* test_new() {
    GImpl* self = malloc(sizeof(GImpl));
    self->count = 0;
    self->title = "";
    self->flags = NULL;
    return self;
}

GImpl* test_new_from_string(char* title) {
    GImpl* self = malloc(sizeof(GImpl));
    if (!self) return NULL;

    size_t len = strlen(title) + 1;
    self->title = malloc(len);
    if (!self->title) {
        free(self);
        return NULL;
    }
    memcpy(self->title, title, len);

    self->count = 0;
    self->flags = NULL;
    return self;
}
