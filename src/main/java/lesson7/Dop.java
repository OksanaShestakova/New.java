package lesson7;

public class Dop {
    public void game() {
        String[] users = {"cat", "blue", "skt", "umbrells", "paddy"};
        String[] correct = {"cat", "blue", "sky", "umbrella", "paddy"};
        int a = users.length;
        String[] newArray = new String[a];

        int i = 0;

        for (i = 0; i < a; i++) {
            if (users[i] == correct[i]) {
                newArray[i] = "1";
                System.out.print(newArray[i] + " ");
            } else {
                newArray[i] = "-1";
                System.out.print(newArray[i] + " ");
            }
        }
        System.out.println();
    }

    public void nameLastname() {
        String fullName = "Ann Poland";
        String[] split = fullName.split(" ");
        System.out.println(split[1] + " " + split[0]);
    }

    public void doubleLetters() {
        String word = "latute";
        boolean result = true;
        int a = word.length();
        int k = 0;
        for (k = 0; k < a - 1; k++) {
            if (word.charAt(k) == word.charAt(k + 1)) {
                result = true;
                System.out.println(result);
                break;
            } else {
                result = false;
            }
        }
        System.out.println(result);
    }

  /*  public void calculateScore() {
        String score = "AABC";
        int s = score.length();
        int Andy = 0;
        char letterA ="A";
        int Ben = 0;
        char letterB ="B";
        int Charlotte = 0;
        char letterC ="C";
        int m = 0;
        for (m = 0; m < s; m++) {
            if (score.charAt(m)==letterA){
                Andy = Andy + 1;
            }
            if (score.charAt(m)==letterB) {
                Ben = Ben + 1;
            }
            if (score.charAt(m)==letterC) {
                Charlotte = Charlotte + 1;
            }
            int[] winner  = {Andy, Ben, Charlotte };
            System.out.println(winner);
        }}*/
    }


