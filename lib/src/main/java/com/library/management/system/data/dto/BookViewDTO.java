package com.library.management.system.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class BookViewDTO {
    Boolean isAvailable;
    String title;
    String author;
    String storyDescription;
}
