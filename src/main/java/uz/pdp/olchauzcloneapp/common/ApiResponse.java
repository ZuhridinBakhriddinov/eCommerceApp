package uz.pdp.olchauzcloneapp.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ApiResponse {
    private String message;
    private boolean success;
    private Object object;


}
