package spelling;

import java.io.PrintWriter;

public class DictionaryGrader {
    public static void main(String args[]) {
        PrintWriter out;
        try {
        	System.out.print("i am here now");
            out = new PrintWriter("grader_output/module4.part1.out");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("i am here now1");
            return;
        }

        int incorrect = 0;
        int tests = 0;
        String feedback = "";

        try {
            Dictionary dictLL = new DictionaryLL();

            feedback += "** Test #1: Adding new word to the LL dictionary...";
            feedback += "addWord returned " + dictLL.addWord("tEst") + ".\n";

            feedback += "** Test #2: Adding a second word...";
            dictLL.addWord("second");
            feedback += "Dictionary size is " + dictLL.size() + ".\n";

            feedback += "** Test #3: Looking up word from first test...";
            feedback += "isWord returned " + dictLL.isWord("teSt") + ".\n";

            Dictionary dictBST = new DictionaryBST();
            System.out.println("dictLL" + dictLL);

            feedback += "** Test #4: Adding a new word to the BST dictionary...";
            feedback += "addWord returned " + dictBST.addWord("tEst") + ".\n";
            
            feedback += "** Test #5: Adding second word to BST dictionary...";
            dictBST.addWord("second");
            feedback += "Dictionary size is " + dictBST.size() + ".\n";
            
            feedback += "** Test #6: Retrieving the word from the first test...";
            feedback += "isWord returned " + dictBST.isWord("teSt") + ".\n";


            feedback += "** Test #7: Adding lots of words and retrieving some...";
            dictBST.addWord("seconds");
            dictBST.addWord("seconded");
            dictBST.addWord("secondhand");
            dictBST.addWord("selma");
            feedback += "isWord(seconded) returned " + dictBST.isWord("seconded") + "; isWord(selma) returned " + dictBST.isWord("selma") + ".\n";
    
            feedback += "** Test #8: Testing non-word in DictLL...";
            feedback += "isWord(soup) returned " + dictLL.isWord("soup") + ".\n";

            feedback += "** Test #9: Testing non-word in DictBST...";
            feedback += "isWord(soup) returned " + dictBST.isWord("soup") + ".\n";
            System.out.println("i am here now3" + dictBST.toString());

        } catch (Exception e) {
            out.println("Runtime error: " + e);
            System.out.println("i am here now4");
            out.close();
            return;
        }

        feedback += "Tests complete. Make sure everything looks right.";

        System.out.println("i am here now555");
        System.out.println(feedback);
        out.println(feedback);
        out.close();
    }
}
