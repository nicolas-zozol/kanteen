package io.kanteen.dto;

import io.kanteen.persistance.entity.Child;

public class ChildDto {
    private long id;
    private String name;
    private String grade;

    public ChildDto(){
    }

    public ChildDto(long id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }


    public ChildDto( String name, String grade) {

        this.name = name;
        this.grade = grade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public ChildDto(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }
}
