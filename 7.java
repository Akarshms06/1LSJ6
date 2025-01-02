package CIE;
public class Student {
    public String usn, name;
    public int sem;
}

package CIE;
public class Internals extends Student {
    public int[] internalMarks = new int[5];
}

package SEE;
import CIE.*;
public class External extends Student {
    public int[] externalMarks = new int[5];
}

import CIE.*;
import SEE.*;
public class FinalMarks {
    public static void main(String[] args) {
        int n = 3; // Number of students
        Internals[] cie = new Internals[n];
        External[] see = new External[n];

        for (int i = 0; i < n; i++) {
            cie[i] = new Internals();
            see[i] = new External();
            for (int j = 0; j < 5; j++) {
                cie[i].internalMarks[j] = /* Input internal marks */;
                see[i].externalMarks[j] = /* Input external marks */;
            }
        }

        // Print final marks
        for (int i = 0; i < n; i++) {
            System.out.println("Final marks for student " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                int finalMark = cie[i].internalMarks[j] + see[i].externalMarks[j];
                System.out.println("Course " + (j + 1) + ": " + finalMark);
            }
        }
    }
}
