package com.example.hello_project.todo.service;

import com.example.hello_project.todo.dto.TodoDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum TodoService {
    // static final 암묵적으로 생략
    INSTANCE;
    //등록 기능
    public void register(TodoDto todoDto){
        System.out.println("서비스에서 작성할 글의 입력 데이터 확인 : "+ todoDto);
    }
    public List<TodoDto> getList(){
        //전
        List<TodoDto> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            TodoDto todoDto = new TodoDto();
            todoDto.setTno((long)i);
            todoDto.setTitle("Todo.." +i);
            todoDto.setDueDate(LocalDate.now());
        }
        // 후, 빌더 패턴,
        // 연속적인 행위,
//        IntStream.range(0,10)
//        .mapToObj(더미데이터 10개생성)
//        .collect(생성된 10개 데이터 리스트화)
        List<TodoDto> todoDTOList2 = IntStream.range(0,10).mapToObj(i -> {
            TodoDto todoDTO = new TodoDto();
            todoDTO.setTno((long)i);
            todoDTO.setTitle("Todo.." +i);
            todoDTO.setDueDate(LocalDate.now());
            return todoDTO;
        }).collect(Collectors.toList());


//        return list;
        return todoDTOList2;
    }

    //하나 조회, TodoDto에서 tno 번호로 맴버 조회하기
    //메모리 상에서 더미로 작업중
    // 내일은 마리아 디비 서버 설치 후 디비 열결 할 예정
    public TodoDto getTodoByTno(long tno){
        TodoDto todoDto = new TodoDto();
        todoDto.setTno(tno);
        todoDto.setTitle("샘플 todo ");
        todoDto.setDueDate(LocalDate.now());
        todoDto.setFinished(true);
        return todoDto;
    }
}
