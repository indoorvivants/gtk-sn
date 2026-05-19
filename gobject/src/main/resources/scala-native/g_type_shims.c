#include <glib-object.h>

size_t __sn_gnome_value_gtype_boolean() {
    return G_TYPE_BOOLEAN;
}

size_t __sn_gnome_value_read_gtype(GValue *value) {
    return G_VALUE_TYPE(value);
}

size_t __sn_gnome_value_gtype_int() {
    return G_TYPE_INT;
}

size_t __sn_gnome_value_gtype_long() {
    return G_TYPE_LONG;
}

size_t __sn_gnome_value_gtype_int64() {
    return G_TYPE_INT64;
}



size_t __sn_gnome_value_gtype_string() {
    return G_TYPE_STRING;
}

size_t __sn_gnome_value_gtype_double() {
    return G_TYPE_DOUBLE;
}

size_t __sn_gnome_value_gtype_float() {
    return G_TYPE_FLOAT;
}

size_t __sn_gnome_value_gtype_gtype() {
    return G_TYPE_GTYPE;
}

size_t __sn_gnome_value_gtype_uint() {
    return G_TYPE_UINT;
}

size_t __sn_gnome_value_gtype_uint64() {
    return G_TYPE_UINT64;
}

size_t __sn_gnome_value_gtype_ulong() {
    return G_TYPE_ULONG;
}

size_t __sn_gnome_value_gtype_pointer() {
    return G_TYPE_POINTER;
}

size_t __sn_gnome_value_gtype_object() {
    return G_TYPE_OBJECT;
}
