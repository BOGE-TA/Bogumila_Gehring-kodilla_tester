class School {
    private String name;
    private List<Integer> classSizes;

    public School(String name, List<Integer> classSizes) {
        this.name = name;
        this.classSizes = classSizes;
    }

    public String getName() {
        return name;
    }

    public int getTotalStudents() {
        return classSizes.stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", classSizes=" + classSizes +
                '}';
    }
}
