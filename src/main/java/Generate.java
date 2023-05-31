public class Generate {

    public String generatePassword(String passwordlength){
        int length = Integer.valueOf(passwordlength);
        StringBuilder password = new StringBuilder();

        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+\\/~?";

        // randomNum = min + (int)(Math.random() * ((max – min) + 1));
        int min = 0;
        int max = charSet.length() - 1;

        for(int i = 0; i < length; i++){
            int index = min + (int)(Math.random() * ((max - min) + 1));
            password.append(charSet.charAt(index));
        }

        return password.toString();
    }
}
