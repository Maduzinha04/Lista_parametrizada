public class ArithProgression extends Progression {
    protected long inc;

    public ArithProgression() {
        this(1); 
    }

    public ArithProgression(long inc) {
        this.inc = inc;
    }

    @Override
    protected long nextValue() {
        this.cur = this.cur + this.inc; 
        return this.cur;
    }
}