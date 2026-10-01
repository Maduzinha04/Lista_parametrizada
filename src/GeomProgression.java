public class GeomProgression extends Progression {
    protected long base;

    public GeomProgression() {
        this(2); 
    }

    public GeomProgression(long base) {
        this.base = base;
        this.first = 1;
        this.cur = this.first;
    }

    @Override
    protected long nextValue() {
        this.cur = this.cur * this.base;
        return this.cur;
    }
}