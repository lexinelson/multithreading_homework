package structure;

import java.util.Objects;

public class Member {

    private String name;
    private Integer birthYear;
    private Integer birthMonth;
    private Integer birthDay;
    private Integer age;

    public Member(String name, Integer birthYear, Integer birthMonth, Integer birthDay, Integer age) {
        this.name = name;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    public Integer getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        Member member = (Member) o;
        return Objects.equals(name, member.name)
                && Objects.equals(birthYear, member.birthYear)
                && Objects.equals(birthMonth, member.birthMonth)
                && Objects.equals(birthDay, member.birthDay)
                && Objects.equals(age, member.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthYear, birthMonth, birthDay, age);
    }
}
