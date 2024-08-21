package com.board.db;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class MemberDto {
	 private int    num     = 0;
	 private String email  = "";
	 private String pw   = "";
	 private String name = "";
	 private String tel = "";
	 private String gender = "";
}
