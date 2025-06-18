public class StackSurat05 {
    Surat05[] stack;
    int top;
    int size;

    public StackSurat05(int size) {
        this.size = size;
        stack = new Surat05[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat05 surat) {
        if (isFull()) {
            System.out.println("Stack surat penuh!");
        } else {
            stack[++top] = surat;
            System.out.println("Surat berhasil ditambahkan.");
        }
    }

    public Surat05 pop() {
        if (isEmpty()) {
            System.out.println("Stack surat kosong!");
            return null;
        } else {
            return stack[top--];
        }
    }

    public Surat05 peek() {
        if (isEmpty()) {
            System.out.println("Stack surat kosong!");
            return null;
        } else {
            return stack[top];
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampilkanSurat();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
