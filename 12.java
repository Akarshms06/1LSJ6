class Sort {
    void Arrange(int t[]) {
        int pos;
        int temp;
        for (int i = 0; i < t.length; i++) {
            pos = i;
            for (int j = i + 1; j < t.length; j++) {
                if (t[j] < t[pos]) {
                    pos = j;
                }
            }
            temp = t[pos];
            t[pos] = t[i];
            t[i] = temp;
        }
    }

    void display(int t[]) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
    }

    public static void main(String args[]) {
        Sort ob = new Sort();
        int arr[] = {64, 25, 12, 22, 11};
        ob.Arrange(arr);
        ob.display(arr);
    }
}

