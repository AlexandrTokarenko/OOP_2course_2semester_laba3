class laba3 {
    private StringBuilder text;

    public laba3(String text) {
        this.text =  new StringBuilder(text);
    }

    public void printText() {
        System.out.println(text);
    }

    public void editText(char chr1, char chr2) {

        int one = text.indexOf(String.valueOf(chr1));
        int two = text.lastIndexOf(String.valueOf(chr2));
        text.delete(one,two+1);
    }

    public int getNumberOfWords() {

        String res = new String(text);
        return res.split(" +").length;
    }
}


    /*public int getNumberOfWords() {
        int count = 0;
        if (text.length() != 0) {
            count ++;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') count ++;
            }
        }
        return count;
    }*/

    /*public void editText() {

        int countCpecial = 0;
        int start = -1;
        int end = -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(' || text.charAt(i) == '*' || text.charAt(i) == ')') {
                countCpecial ++;
                if (countCpecial == 1) start = i;
                if (countCpecial == 2) {
                    end = i+1;
                    countCpecial = 0;
                    text.delete(start,end);
                }
            }
        }
    }*/