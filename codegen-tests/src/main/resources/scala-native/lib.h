#include <glib.h>

typedef struct {
    char* title;
    int count;
    char** flags;
} GImpl;

void test_set_options(GImpl* self, int a, char* title, char** flags);
char** test_concat_title(char* prefix, char** strings);

char** test_get_flags(GImpl* self);
char* test_get_title(GImpl* self);
int test_get_count(GImpl* self);
int test_sqrt_count(GImpl* self , GError** err);

GImpl* test_new();
GImpl* test_new_from_string(char* title);
GImpl* test_new_from_count(gint count, GError** err);
