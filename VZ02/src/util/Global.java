package util;

/**
 * @author      Dery Rahman <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
@SuppressWarnings("ALL")
public class Global {

    /* variable declaration for bioType */
    @SuppressWarnings("unused")
    public final static short WATER = 1;
    @SuppressWarnings("unused")
    public final static short LAND = 2;
    @SuppressWarnings("unused")
    public final static short AIR = 4;
    @SuppressWarnings("unused")
    public final static short PARK = 8;
    @SuppressWarnings("unused")
    public final static short RESTAURANT = 16;
    @SuppressWarnings("unused")
    public final static short ROAD = 32;
    @SuppressWarnings("unused")
    public final static short EXIT = 64;
    @SuppressWarnings("unused")
    public final static short ENTRANCE = 128;

    /* variable declaration for dietType */
    @SuppressWarnings("unused")
    public final static short HERB = 1;
    @SuppressWarnings("unused")
    public final static short CARN = 2;

    /* variable declaration for resporatoryOrgan */
    @SuppressWarnings("unused")
    public final static short LUNG = 1;
    @SuppressWarnings("unused")
    public final static short GILL = 2;

    /* text color */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    @SuppressWarnings("unused")
    public static final String ANSI_RED = "\u001B[31m";
    @SuppressWarnings("unused")
    public static final String ANSI_GREEN = "\u001B[32m";
    @SuppressWarnings("unused")
    public static final String ANSI_YELLOW = "\u001B[33m";
    @SuppressWarnings("unused")
    public static final String ANSI_BLUE = "\u001B[34m";
    @SuppressWarnings("unused")
    public static final String ANSI_PURPLE = "\u001B[35m";
    @SuppressWarnings("unused")
    public static final String ANSI_CYAN = "\u001B[36m";
    @SuppressWarnings("unused")
    public static final String ANSI_WHITE = "\u001B[37m";

    /* background color */
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    @SuppressWarnings("unused")
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    @SuppressWarnings("unused")
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

}
