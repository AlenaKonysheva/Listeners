package data;

public enum CoursesData {

    Highload_Architect("Highload Architect", CourseTypeData.Programmer);

    private String name;
    private CourseTypeData courseTypeData;

    CoursesData(String name, CourseTypeData courseTypeData) {
        this.name = name;
        this.courseTypeData = courseTypeData;
    }

    public String getName() {
        return name;
    }

    public CourseTypeData getCourseTypeData() {
        return courseTypeData;
    }
}