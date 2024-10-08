package org.example.expert.domain.todo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TodoSearchRequset {
    private String weather;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
}
