public class StackTugasMahasiswa05 {
    Mahasiswa05[] stack;
    int size;
    int top;

    public StackTugasMahasiswa05(int size) {
        this.size = size;
        stack = new Mahasiswa05[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa05 mhs) {
        if (!isFull()) {
            stack[++top] = mhs;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Mahasiswa05 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Mahasiswa05 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack kosong.");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println("Mahasiswa: " + stack[i].nama + " | NIM: " + stack[i].nim + " | Kelas: " + stack[i].kelas + " | Nilai: " + stack[i].nilai);
            }
        }
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi05 stack = new StackKonversi05();
        while (nilai > 0) {
        int sisa = nilai % 2;
        stack.push(sisa);
        nilai = nilai / 2;
        }

        String biner = "";
        while (!stack.isEmpty()) {
        biner += stack.pop();
        }

        return biner;
    }

}
