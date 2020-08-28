public class Specialty {
    private String name;
    private int complexity;
    private int identifier;

    public Specialty(String pName, int pComlexity, int pIdentifier) {
        this.name = pName;
        this.complexity = pComlexity;
        this.identifier = pIdentifier;
    }

    public String getName() {
        return name;
    }

    public int getComplexity() {
        return complexity;
    }

    public int getIdentifier() { return identifier; }
}
