package Unit_8.D;

import java.util.Arrays;

public class q2 {
    public static String[] residents = { "Kara Atkins", "Selena Cummings", "Garrett Clayton", "Brooks Ward",
            "Oliver Hickman", "Marlee Horne", "Joanna Tapia", "Megan Sampson", "Kaya Harding", "Conor Wiggins",
            "Logan Bolton", "Phillip Mathis", "Alissa Skinner", "Junior Rodgers", "Braden Jennings", "Taryn Mclaughlin",
            "Henry Cummings", "Hezekiah Stein", "Phillip Grimes", "Jay Pace", "Elliot Schultz", "Cassie Banks",
            "Emery Sweeney", "Keshawn Patton", "Jorden Lutz", "Jakob Hodge", "Tristian Garrett", "Gabriela Petersen",
            "Dillon Franco", "Eli Solis", "Cason Blanchard", "Macey Delgado", "Sadie Villa", "Yadiel Douglas",
            "Olivia Owen", "Ann Santiago", "Andres Summers", "Allisson Christensen", "Madden Pacheco", "Hadley Cowan",
            "Christopher Mccarty", "Troy Benitez", "Catalina Odom", "Carter Roach", "Baron Galloway", "Odin Lee",
            "Danielle Walker", "Hazel Lloyd", "Skye Erickson", "Cordell Sherman", "Adam Roberts", "Dominique Benitez",
            "Tate Moran", "Lana Mcintyre", "Ryleigh Nicholson", "Hugh Crawford", "Devan Henson", "Alejandra Dyer",
            "Leticia Pratt", "Evie Collins", "Jacquelyn Wang", "Ayden Poole", "Claire Donovan", "Gloria Wilkins",
            "Ernest Booth", "Aaden Bruce", "Karly Ross", "Koen Gordon", "Eduardo Glover", "Konnor Michael",
            "Mina Serrano", "Ricky Roberson", "Miriam Goodman", "Sariah Carr", "Amani Mendez", "Amelia Haley",
            "Kathy Miranda", "Jon Jefferson", "Arely Tucker", "Lauren Lopez", "Carla Patel", "Mia Mcfarland",
            "Caitlin Hensley", "Mikaela Cooke", "Tristin Kirk", "Pranav Leach", "Justine Richardson", "Addisyn Pugh",
            "Leonardo Rollins", "Braeden Velasquez", "Rylan Massey", "Jackson Chung", "Dean Wiley",
            "Cornelius Schaefer", "Simeon Chapman", "Damien Huynh", "Valentin Mendez", "Beckett Barber", "Peyton Vance",
            "Reagan Huber" };
    public static String[] birthCountries = { "Bahrain", "France", "USA", "Germany", "UAE", "Kuwait", "Saudi Arabia",
            "India", "Pakistan", "China", "Argentina", "Australia", "Belgium", "Brazil", "Canada", "Colombia", "Cuba",
            "Egypt", "Fiji", "Pakistan", "Finland", "Ireland", "Japan", "Italy", "Kenya", "Bahrain", "France", "USA",
            "Germany", "UAE", "USA", "Saudi Arabia", "India", "Pakistan", "China", "Argentina", "Australia", "Belgium",
            "Brazil", "Canada", "Colombia", "Cuba", "Egypt", "Fiji", "Pakistan", "Finland", "Ireland", "Japan", "Italy",
            "Kenya", "USA", "Pakistan", "Bahrain", "France", "USA", "Germany", "UAE", "Kuwait", "Saudi Arabia", "India",
            "Pakistan", "China", "Argentina", "Australia", "Belgium", "Brazil", "Canada", "Colombia", "Cuba", "Egypt",
            "Fiji", "Pakistan", "Bahrain", "France", "USA", "Germany", "UAE", "USA", "Saudi Arabia", "India",
            "Pakistan", "China", "Argentina", "Australia", "Belgium", "Brazil", "Canada", "Colombia", "Egypt",
            "Bahrain", "France", "USA", "Germany", "UAE", "USA", "Saudi Arabia", "India", "Pakistan", "China",
            "Argentina", "Australia", "Belgium" };

    public static void main(String[] args) {
        String country = "Pakistan";
        System.out.println("The list of residents who were born in " + country + " is: "
                + Arrays.toString(getListInCountry(country)));
    }

    private static String[] getListInCountry(String country) {
        String[] names = new String[birthCountries.length];
        int occurrence = 0;
        for (int i = 0; i < birthCountries.length; i++) {
            if (country.equals(birthCountries[i])) {
                System.out.println(residents[i]);
                names[occurrence] = residents[i];
                occurrence++;
            }
        }
        String[] shortArrNames = new String[occurrence];
        System.arraycopy(names, 0, shortArrNames, 0, occurrence);
        return shortArrNames;
    }
}
