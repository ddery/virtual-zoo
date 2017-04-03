/*
 * author : Dery (13515097)
 */

#ifndef COLORMOD_H
#define COLORMOD_H

#include <ostream>
namespace Color {
    enum Code {
        FG_RED          = 31,
        FG_GREEN        = 32,
        FG_BLUE         = 34,
        FG_YELLOW       = 33,
        FG_DEFAULT      = 39,
        FG_WHITE        = 97,
        BG_LIGHT_YELLOW = 103,
        BG_DARK_GRAY    = 100,
        BG_WHITE        = 107,
        BG_LIGHT_GRAY   = 47,
        BG_RED          = 41,
        BG_MAGENTA      = 45,
        BG_GREEN        = 42,
        BG_BLUE         = 44,
        BG_DEFAULT      = 49
    };
    class Modifier {
        Code code;
    public:
        Modifier(Code pCode) : code(pCode) {}
        friend std::ostream&
        operator<<(std::ostream& os, const Modifier& mod) {
            return os << "\033[" << mod.code << "m";
        }
    };
}
#endif
