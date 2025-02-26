public class CrewSize {

    static void crewSize(String crews){
        String [] array = crews.split("-");
        int pirateSize = array[0].length();
        int raidedSize = array[1].length();
        if(pirateSize == raidedSize){
            System.out.printf("%s => Ships had the same crew size \n",crews);
        } else {
            System.out.printf("%s => %s had a larger crew, difference %d \n",crews, pirateSize > raidedSize? "Pirate": "Raided", Math.abs(pirateSize - raidedSize) );
        }

    }
    public static void main(String[] args) {
        crewSize("|-|||");
        crewSize("|-||");
        crewSize("|||-|||");
        crewSize("|||||-||");
    }

}
