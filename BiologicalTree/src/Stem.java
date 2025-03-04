class Stem {
    private Branch branch1, branch2;

    public Stem() {
        branch1 = new Branch();
        branch2 = new Branch();
    }

    public Branch getBranch1() {
        return branch1;
    }

    public Branch getBranch2() {
        return branch2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Stem stem = (Stem) obj;
        return branch1.equals(stem.branch1) &&
                branch2.equals(stem.branch2);
    }
}

