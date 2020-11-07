package board.board.dto;

import lombok.Data;

@Data
public class BoardDto {
	public int boardIdx;
	private String title;
	private String contents;
	public int hitCnt;
	public String creatorId;
	public String createdDatetime;
	public String updaterId;
	public String updatedDatetime;
}
