////////////////////////////////////////////////////////////////////
// ANDREA SANTI 2084624
// FRANCESCO POZZOBON 2075513
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {
    @Test
    public void checkPrintPrimiTre(){
        String var1 = " ___  \n" +
                "|_ _| \n" +
                " | |  \n" +
                " | |  \n" +
                "|___| \n";
        String var2 = " ___   ___  \n" +
                "|_ _| |_ _| \n" +
                " | |   | |  \n" +
                " | |   | |  \n" +
                "|___| |___| \n";
        String var3 = " ___   ___   ___  \n" +
                "|_ _| |_ _| |_ _| \n" +
                " | |   | |   | |  \n" +
                " | |   | |   | |  \n" +
                "|___| |___| |___| \n";
        assertEquals(var1, RomanPrinter.print(1));
        assertEquals(var2, RomanPrinter.print(2));
        assertEquals(var3, RomanPrinter.print(3));
}
    @Test
    public void checkPrintPrimiSei(){
        String var4 = " _____     __\n" +
                "|_ _\\ \\   / /\n" +
                " | | \\ \\ / / \n" +
                " | |  \\ V /  \n" +
                "|___|  \\_/   \n";
        String var5 = "__     __\n" +
                "\\ \\   / /\n" +
                " \\ \\ / / \n" +
                "  \\ V /  \n" +
                "   \\_/   \n";
        String var6 = "__     _____ \n" +
                "\\ \\   / /_ _|\n" +
                " \\ \\ / / | | \n" +
                "  \\ V /  | | \n" +
                "   \\_/  |___|\n";
        assertEquals(var4, RomanPrinter.print(4));
        assertEquals(var5, RomanPrinter.print(5));
        assertEquals(var6, RomanPrinter.print(6));
    }

    @Test
    public void checkPrintPrimiDieci(){
        String var7 = "__     _____ ___ \n" +
                "\\ \\   / /_ _|_ _|\n" +
                " \\ \\ / / | | | | \n" +
                "  \\ V /  | | | | \n" +
                "   \\_/  |___|___|\n";
        String var8 = "__     _____ ___ ___ \n" +
                "\\ \\   / /_ _|_ _|_ _|\n" +
                " \\ \\ / / | | | | | | \n" +
                "  \\ V /  | | | | | | \n" +
                "   \\_/  |___|___|___|\n";
        String var9 = "_____  __\n" +
                "|_ _\\ \\/ /\n" +
                " | | \\  / \n" +
                " | | /  \\ \n" +
                "|___/_/\\_\\\n";
        String var10 = "__  __\n" +
                "\\ \\/ /\n" +
                " \\  / \n" +
                " /  \\ \n" +
                "/_/\\_\\\n";
        assertEquals(var7, RomanPrinter.print(7));
        assertEquals(var8, RomanPrinter.print(8));
        assertEquals(var9, RomanPrinter.print(9));
        assertEquals(var10, RomanPrinter.print(10));
    }

    @Test
    public void checkPrintPrimiVenti(){
        String var13 = "__  _____ ___ ___ \n" +
                "\\ \\/ /_ _|_ _|_ _|\n" +
                " \\  / | | | | | | \n" +
                " /  \\ | | | | | | \n" +
                "/_/\\_\\___|___|___|\n";
        String var15 = "__  ____     __\n" +
                "\\ \\/ /\\ \\   / /\n" +
                " \\  /  \\ \\ / / \n" +
                " /  \\   \\ V /  \n" +
                "/_/\\_\\   \\_/   \n";
        String var17 = "__  ____     _____ ___ \n" +
                "\\ \\/ /\\ \\   / /_ _|_ _|\n" +
                " \\  /  \\ \\ / / | | | | \n" +
                " /  \\   \\ V /  | | | | \n" +
                "/_/\\_\\   \\_/  |___|___|\n";
        String var19 = "__  _______  __\n" +
                "\\ \\/ /_ _\\ \\/ /\n" +
                " \\  / | | \\  / \n" +
                " /  \\ | | /  \\ \n" +
                "/_/\\_\\___/_/\\_\\\n";
        String var20 = "__  ____  __\n" +
                "\\ \\/ /\\ \\/ /\n" +
                " \\  /  \\  / \n" +
                " /  \\  /  \\ \n" +
                "/_/\\_\\/_/\\_\\\n";
        assertEquals(var13, RomanPrinter.print(13));
        assertEquals(var15, RomanPrinter.print(15));
        assertEquals(var17, RomanPrinter.print(17));
        assertEquals(var19, RomanPrinter.print(19));
        assertEquals(var20, RomanPrinter.print(20));
    }
    @Test
    public void checkPrintPrimiCinquanta(){
        String var21 = "__  ____  _____ \n" +
                "\\ \\/ /\\ \\/ /_ _|\n" +
                " \\  /  \\  / | | \n" +
                " /  \\  /  \\ | | \n" +
                "/_/\\_\\/_/\\_\\___|";
        String var25 = "__  ____  ____     __\n" +
                "\\ \\/ /\\ \\/ /\\ \\   / /\n" +
                " \\  /  \\  /  \\ \\ / / \n" +
                " /  \\  /  \\   \\ V /  \n" +
                "/_/\\_\\/_/\\_\\   \\_/   ";
        String var32 = "__  ____  ____  _____ ___ \n" +
                "\\ \\/ /\\ \\/ /\\ \\/ /_ _|_ _|\n" +
                " \\  /  \\  /  \\  / | | | | \n" +
                " /  \\  /  \\  /  \\ | | | | \n" +
                "/_/\\_\\/_/\\_\\/_/\\_\\___|___|";
        String var37 = "__  ____  ____  ____     _____ ___ \n" +
                "\\ \\/ /\\ \\/ /\\ \\/ /\\ \\   / /_ _|_ _|\n" +
                " \\  /  \\  /  \\  /  \\ \\ / / | | | | \n" +
                " /  \\  /  \\  /  \\   \\ V /  | | | | \n" +
                "/_/\\_\\/_/\\_\\/_/\\_\\   \\_/  |___|___|";
        String var46 = "__  ___ __     _____ \n" +
                "\\ \\/ / |\\ \\   / /_ _|\n" +
                " \\  /| | \\ \\ / / | | \n" +
                " /  \\| |__\\ V /  | | \n" +
                "/_/\\_\\_____\\_/  |___|";
        String var49 = "__  ___     _____  __\n" +
                "\\ \\/ / |   |_ _\\ \\/ /\n" +
                " \\  /| |    | | \\  / \n" +
                " /  \\| |___ | | /  \\ \n" +
                "/_/\\_\\_____|___/_/\\_\\";
        String var50 = " _     \n" +
                "| |    \n" +
                "| |    \n" +
                "| |___ \n" +
                "|_____|";

        assertEquals(var21, RomanPrinter.print(21));
        assertEquals(var25, RomanPrinter.print(25));
        assertEquals(var32, RomanPrinter.print(32));
        assertEquals(var37, RomanPrinter.print(37));
        assertEquals(var46, RomanPrinter.print(46));
        assertEquals(var49, RomanPrinter.print(49));
        assertEquals(var50, RomanPrinter.print(50));
    }

    @Test
    public void checkPrintPrimiCento() {
        String var51 =" _     ___ \n" +
                "| |   |_ _|\n" +
                "| |    | | \n" +
                "| |___ | | \n" +
                "|_____|___|";
        String var57 =" _ __     _____ ___ \n" +
                "| |\\ \\   / /_ _|_ _|\n" +
                "| | \\ \\ / / | | | | \n" +
                "| |__\\ V /  | | | | \n" +
                "|_____\\_/  |___|___|";
        String var62 =" _    __  _____ ___ \n" +
                "| |   \\ \\/ /_ _|_ _|\n" +
                "| |    \\  / | | | | \n" +
                "| |___ /  \\ | | | | \n" +
                "|_____/_/\\_\\___|___|";
        String var68 =" _    __  ____     _____ ___ ___ \n" +
                "| |   \\ \\/ /\\ \\   / /_ _|_ _|_ _|\n" +
                "| |    \\  /  \\ \\ / / | | | | | | \n" +
                "| |___ /  \\   \\ V /  | | | | | | \n" +
                "|_____/_/\\_\\   \\_/  |___|___|___|";
        String var70 =" _    __  ____     _____ ___ ___ \n" +
                "| |   \\ \\/ /\\ \\   / /_ _|_ _|_ _|\n" +
                "| |    \\  /  \\ \\ / / | | | | | | \n" +
                "| |___ /  \\   \\ V /  | | | | | | \n" +
                "|_____/_/\\_\\   \\_/  |___|___|___|";
        String var73 =" _    __  ____  _____ ___ ___ \n" +
                "| |   \\ \\/ /\\ \\/ /_ _|_ _|_ _|\n" +
                "| |    \\  /  \\  / | | | | | | \n" +
                "| |___ /  \\  /  \\ | | | | | | \n" +
                "|_____/_/\\_\\/_/\\_\\___|___|___|";
        String var84 =" _    __  ____  ____  _______     __\n" +
                "| |   \\ \\/ /\\ \\/ /\\ \\/ /_ _\\ \\   / /\n" +
                "| |    \\  /  \\  /  \\  / | | \\ \\ / / \n" +
                "| |___ /  \\  /  \\  /  \\ | |  \\ V /  \n" +
                "|_____/_/\\_\\/_/\\_\\/_/\\_\\___|  \\_/   ";
        String var86 =" _    __  ____  ____  ____     _____ \n" +
                "| |   \\ \\/ /\\ \\/ /\\ \\/ /\\ \\   / /_ _|\n" +
                "| |    \\  /  \\  /  \\  /  \\ \\ / / | | \n" +
                "| |___ /  \\  /  \\  /  \\   \\ V /  | | \n" +
                "|_____/_/\\_\\/_/\\_\\/_/\\_\\   \\_/  |___|";
        String var95 ="__  ________     __\n" +
                "\\ \\/ / ___\\ \\   / /\n" +
                " \\  / |    \\ \\ / / \n" +
                " /  \\ |___  \\ V /  \n" +
                "/_/\\_\\____|  \\_/   ";
        String var99 ="__  ______ _____  __\n" +
                "\\ \\/ / ___|_ _\\ \\/ /\n" +
                " \\  / |    | | \\  / \n" +
                " /  \\ |___ | | /  \\ \n" +
                "/_/\\_\\____|___/_/\\_\\";

        assertEquals(var51, RomanPrinter.print(51));
        assertEquals(var57, RomanPrinter.print(57));
        assertEquals(var62, RomanPrinter.print(62));
        assertEquals(var68, RomanPrinter.print(68));
        assertEquals(var70, RomanPrinter.print(70));
        assertEquals(var73, RomanPrinter.print(73));
        assertEquals(var84, RomanPrinter.print(84));
        assertEquals(var86, RomanPrinter.print(86));
        assertEquals(var95, RomanPrinter.print(95));
        assertEquals(var99, RomanPrinter.print(99));

    }

    @Test
    public void checkPrintPrimiCinquecento() {
        String var101 = "  ____ ___ \n" +
                " / ___|_ _|\n" +
                "| |    | | \n" +
                "| |___ | | \n" +
                " \\____|___|";
        String var167 = "  ____ _    __  ____     _____ ___ \n" +
                " / ___| |   \\ \\/ /\\ \\   / /_ _|_ _|\n" +
                "| |   | |    \\  /  \\ \\ / / | | | | \n" +
                "| |___| |___ /  \\   \\ V /  | | | | \n" +
                " \\____|_____/_/\\_\\   \\_/  |___|___|";
        String var180 = "  ____ _    __  ____  ____  __\n" +
                " / ___| |   \\ \\/ /\\ \\/ /\\ \\/ /\n" +
                "| |   | |    \\  /  \\  /  \\  / \n" +
                "| |___| |___ /  \\  /  \\  /  \\ \n" +
                " \\____|_____/_/\\_\\/_/\\_\\/_/\\_\\";
        String var190 = "  ______  ______ \n" +
                " / ___\\ \\/ / ___|\n" +
                "| |    \\  / |    \n" +
                "| |___ /  \\ |___ \n" +
                " \\____/_/\\_\\____|";
        String var211 = "  ____ ______  _____ \n" +
                " / ___/ ___\\ \\/ /_ _|\n" +
                "| |  | |    \\  / | | \n" +
                "| |__| |___ /  \\ | | \n" +
                " \\____\\____/_/\\_\\___|";
        String var245 = "  ____ ______  ___ __     __\n" +
                " / ___/ ___\\ \\/ / |\\ \\   / /\n" +
                "| |  | |    \\  /| | \\ \\ / / \n" +
                "| |__| |___ /  \\| |__\\ V /  \n" +
                " \\____\\____/_/\\_\\_____\\_/   ";
        String var328 = "  ____ ____ ______  ____  ____     _____ ___ ___ \n" +
                " / ___/ ___/ ___\\ \\/ /\\ \\/ /\\ \\   / /_ _|_ _|_ _|\n" +
                "| |  | |  | |    \\  /  \\  /  \\ \\ / / | | | | | | \n" +
                "| |__| |__| |___ /  \\  /  \\   \\ V /  | | | | | | \n" +
                " \\____\\____\\____/_/\\_\\/_/\\_\\   \\_/  |___|___|___|";
        String var342 = "  ____ ____ ______  ___     ___ ___ \n" +
                " / ___/ ___/ ___\\ \\/ / |   |_ _|_ _|\n" +
                "| |  | |  | |    \\  /| |    | | | | \n" +
                "| |__| |__| |___ /  \\| |___ | | | | \n" +
                " \\____\\____\\____/_/\\_\\_____|___|___|";
        String var399 = "  ____ ____ ______  ______ _____  __\n" +
                " / ___/ ___/ ___\\ \\/ / ___|_ _\\ \\/ /\n" +
                "| |  | |  | |    \\  / |    | | \\  / \n" +
                "| |__| |__| |___ /  \\ |___ | | /  \\ \n" +
                " \\____\\____\\____/_/\\_\\____|___/_/\\_\\";
        String var400 = "  ____ ____  \n" +
                " / ___|  _ \\ \n" +
                "| |   | | | |\n" +
                "| |___| |_| |\n" +
                " \\____|____/ ";
        String var433 = "  ____ ______  ____  ____  _____ ___ ___ \n" +
                " / ___|  _ \\ \\/ /\\ \\/ /\\ \\/ /_ _|_ _|_ _|\n" +
                "| |   | | | \\  /  \\  /  \\  / | | | | | | \n" +
                "| |___| |_| /  \\  /  \\  /  \\ | | | | | | \n" +
                " \\____|____/_/\\_\\/_/\\_\\/_/\\_\\___|___|___|";
        String var451 = "  ____ ____  _     ___ \n" +
                " / ___|  _ \\| |   |_ _|\n" +
                "| |   | | | | |    | | \n" +
                "| |___| |_| | |___ | | \n" +
                " \\____|____/|_____|___|";
        String var477 = "  ____ ____  _    __  ____  ____     _____ ___ \n" +
                " / ___|  _ \\| |   \\ \\/ /\\ \\/ /\\ \\   / /_ _|_ _|\n" +
                "| |   | | | | |    \\  /  \\  /  \\ \\ / / | | | | \n" +
                "| |___| |_| | |___ /  \\  /  \\   \\ V /  | | | | \n" +
                " \\____|____/|_____/_/\\_\\/_/\\_\\   \\_/  |___|___|";

        assertEquals(var101, RomanPrinter.print(101));
        assertEquals(var167, RomanPrinter.print(167));
        assertEquals(var180, RomanPrinter.print(180));
        assertEquals(var190, RomanPrinter.print(190));
        assertEquals(var211, RomanPrinter.print(211));
        assertEquals(var245, RomanPrinter.print(245));
        assertEquals(var328, RomanPrinter.print(328));
        assertEquals(var342, RomanPrinter.print(342));
        assertEquals(var399, RomanPrinter.print(399));
        assertEquals(var400, RomanPrinter.print(400));
        assertEquals(var433, RomanPrinter.print(433));
        assertEquals(var451, RomanPrinter.print(451));
        assertEquals(var477, RomanPrinter.print(477));
    }

    @Test
    public void checkPrintPrimiMille() {
        String var501 = " ____ ___ \n" +
                "|  _ \\_ _|\n" +
                "| | | | | \n" +
                "| |_| | | \n" +
                "|____/___|";
        String var529 = " ______  ____  _______  __\n" +
                "|  _ \\ \\/ /\\ \\/ /_ _\\ \\/ /\n" +
                "| | | \\  /  \\  / | | \\  / \n" +
                "| |_| /  \\  /  \\ | | /  \\ \n" +
                "|____/_/\\_\\/_/\\_\\___/_/\\_\\";
        String var612 = " ____   ______  _____ ___ \n" +
                "|  _ \\ / ___\\ \\/ /_ _|_ _|\n" +
                "| | | | |    \\  / | | | | \n" +
                "| |_| | |___ /  \\ | | | | \n" +
                "|____/ \\____/_/\\_\\___|___|";
        String var625 = " ____   ______  ____  ____     __\n" +
                "|  _ \\ / ___\\ \\/ /\\ \\/ /\\ \\   / /\n" +
                "| | | | |    \\  /  \\  /  \\ \\ / / \n" +
                "| |_| | |___ /  \\  /  \\   \\ V /  \n" +
                "|____/ \\____/_/\\_\\/_/\\_\\   \\_/   ";
        String var736 = " ____   ____ ______  ____  ____  ____     _____ \n" +
                "|  _ \\ / ___/ ___\\ \\/ /\\ \\/ /\\ \\/ /\\ \\   / /_ _|\n" +
                "| | | | |  | |    \\  /  \\  /  \\  /  \\ \\ / / | | \n" +
                "| |_| | |__| |___ /  \\  /  \\  /  \\   \\ V /  | | \n" +
                "|____/ \\____\\____/_/\\_\\/_/\\_\\/_/\\_\\   \\_/  |___|";
        String var754 = " ____   ____ ____ _     _____     __\n" +
                "|  _ \\ / ___/ ___| |   |_ _\\ \\   / /\n" +
                "| | | | |  | |   | |    | | \\ \\ / / \n" +
                "| |_| | |__| |___| |___ | |  \\ V /  \n" +
                "|____/ \\____\\____|_____|___|  \\_/   ";
        String var846 = " ____   ____ ____ ______  ___ __     _____ \n" +
                "|  _ \\ / ___/ ___/ ___\\ \\/ / |\\ \\   / /_ _|\n" +
                "| | | | |  | |  | |    \\  /| | \\ \\ / / | | \n" +
                "| |_| | |__| |__| |___ /  \\| |__\\ V /  | | \n" +
                "|____/ \\____\\____\\____/_/\\_\\_____\\_/  |___|";
        String var868 = " ____   ____ ____ ____ _    __  ____     _____ ___ ___ \n" +
                "|  _ \\ / ___/ ___/ ___| |   \\ \\/ /\\ \\   / /_ _|_ _|_ _|\n" +
                "| | | | |  | |  | |   | |    \\  /  \\ \\ / / | | | | | | \n" +
                "| |_| | |__| |__| |___| |___ /  \\   \\ V /  | | | | | | \n" +
                "|____/ \\____\\____\\____|_____/_/\\_\\   \\_/  |___|___|___|";
        String var983 = "  ____ __  __ _    __  ____  ____  _____ ___ ___ \n" +
                " / ___|  \\/  | |   \\ \\/ /\\ \\/ /\\ \\/ /_ _|_ _|_ _|\n" +
                "| |   | |\\/| | |    \\  /  \\  /  \\  / | | | | | | \n" +
                "| |___| |  | | |___ /  \\  /  \\  /  \\ | | | | | | \n" +
                " \\____|_|  |_|_____/_/\\_\\/_/\\_\\/_/\\_\\___|___|___|";
        String var999 = "  ____ __  ____  ______ _____  __\n" +
                " / ___|  \\/  \\ \\/ / ___|_ _\\ \\/ /\n" +
                "| |   | |\\/| |\\  / |    | | \\  / \n" +
                "| |___| |  | |/  \\ |___ | | /  \\ \n" +
                " \\____|_|  |_/_/\\_\\____|___/_/\\_\\";

        assertEquals(var501, RomanPrinter.print(501));
        assertEquals(var529, RomanPrinter.print(529));
        assertEquals(var612, RomanPrinter.print(612));
        assertEquals(var625, RomanPrinter.print(625));
        assertEquals(var736, RomanPrinter.print(736));
        assertEquals(var754, RomanPrinter.print(754));
        assertEquals(var846, RomanPrinter.print(846));
        assertEquals(var868, RomanPrinter.print(868));
        assertEquals(var983, RomanPrinter.print(983));
        assertEquals(var999, RomanPrinter.print(999));
    }
}
