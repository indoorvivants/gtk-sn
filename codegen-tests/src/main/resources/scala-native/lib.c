#include "lib.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

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

GImpl* test_new() {
    GImpl* self = malloc(sizeof(GImpl));
    self->count = 0;
    self->title = "";
    self->flags = NULL;
    return self;
}
GImpl* test_new_from_string(char* title) {
    GImpl* self = malloc(sizeof(GImpl));
    self->count = 0;
    self->title = strdup(title);
    self->flags = NULL;
    return self;
}
