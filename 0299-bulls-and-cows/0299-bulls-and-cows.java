class Solution {
    public String getHint(String secret, String guess) {
        String ans = "";

        int b = 0;
        int c = 0;

        int[] SF = new int[10];
        int[] GF = new int[10];

        for(int i=0;i<guess.length();i++){
            if(secret.charAt(i) == guess.charAt(i)){
                b++;
            }else{
                SF[secret.charAt(i)-'0']++;
                GF[guess.charAt(i)-'0']++;
            }
        }

        for(int i=0;i<10;i++){
           c += Math.min(SF[i], GF[i]);
        }

        return b+"A"+c+"B";
    }
}