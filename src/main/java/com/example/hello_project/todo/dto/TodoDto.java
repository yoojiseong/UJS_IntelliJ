package com.example.hello_project.todo.dto;

import java.time.LocalDate;

public class TodoDto {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;

    // 반자동으로 생성
    // 1) 맴버 선택 후 반자동으로 생성
    // 2) lombok 라이브러리를 사용해서 메모리에 자동생성

    public Long getTno() {
        return tno;
    }

    public void setTno(Long tno) {
        this.tno = tno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public TodoDto(Long tno, String title, LocalDate dueDate, boolean finished) {
        this.tno = tno;
        this.title = title;
        this.dueDate = dueDate;
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "TodoDto{" +
                "tno=" + tno +
                ", title='" + title + '\'' +
                ", dueDate=" + dueDate +
                ", finished=" + finished +
                '}';
    }
    public TodoDto(){}
}
