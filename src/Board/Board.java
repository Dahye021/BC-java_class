package Board;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private int bno;
    private String bTitle;
    private String bContent;
    private String bWriter;
    private String bDate;
}
