public class Progression {
    protected long first;
    protected long cur;

    public Progression() {
        this.cur = 0;
        this.first = 0;
    }
    protected long firstValue() {
        this.cur = this.first;
        return this.cur;
    }

    protected long nextValue() {
        this.cur = this.cur + 1; 
        return this.cur;
    }

    public void printProgression(int n) {
        System.out.print(firstValue()); 

        for (int i = 2; i <= n; i++) {
            System.out.print(" " + nextValue());
        }
        System.out.println(); 
    }
}