class SY2023BIT505{
    public int getValidRegistrationNumber(String[] enrollment){
        int count=0;
        boolean isValid=true;
        //loop for each enrollment number
        for(int i=0; i<enrollment.length; i++){
            isValid=true;

            //check if length of enrollment is 10
            if (enrollment[i].length()!=10) {
                continue;//skip next iteration if length is not 10
            }
            else{
                //loop through each character in the loop
                for (int j = 0; j < enrollment.length; j++) {
                    //check index on the conditions based on the validate characters 
                    if (j <4 || (j>= 7 && j< enrollment[i].length())) {
                        char charAtInd=enrollment[i].charAt(j);
                        //check if character at given index isdigit
                        if (!Character.isDigit(charAtInd)) {
                            isValid=false;
                            break;
                        }
                    }
                    if (j>=4 && j<7) {
                        String iddept=enrollment[i].substring(4, 7);
                        //check id of department is valid like bcs,bit,bch,bme 
                        if (!(iddept.equalsIgnoreCase("bch") || iddept.equalsIgnoreCase("bcs") || iddept.equalsIgnoreCase("bme") || iddept.equalsIgnoreCase("bit"))) {
                            isValid=false;//mark as invalid and break the loop
                            break;
                        }
                    }
                }
                //if enollment number is valid increment the count 
                if (isValid) {
                    count ++;
                }
            }
        }
        return count ;
    }
}
public class registrationnumberclass {
    public static void main(String[] args) {
        String enrollment[]={"2023bit505","2023505505","bit2023505","2023bcs505","abcdwerxyz","2023bme505","2023bch505"};
        SY2023BIT505 myreg= new SY2023BIT505();
        //call the getvalid registration function 
        int count =myreg.getValidRegistrationNumber(enrollment);
        System.out.println(count);   
    }
}
