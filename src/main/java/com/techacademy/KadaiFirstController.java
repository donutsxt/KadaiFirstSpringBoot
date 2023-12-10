package com.techacademy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.DayOfWeek;

@RestController
public class KadaiFirstController {
    //曜日を取得
    @GetMapping("/dayofweek/{val}")
    public String dispDayOfWeek(@PathVariable String val){
        //日付のフォーマットをyyymmddに設定
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyyMMdd");
        //valのフォーマットを変換
        LocalDate date = LocalDate.parse(val, format);
        //曜日を取得
        DayOfWeek dayofweek = date.getDayOfWeek();
        return "実行結果：" + dayofweek;
    }

    //足し算
    @GetMapping("plus/{val1}/{val2}")
    public String calcPlus(@PathVariable String val1,@PathVariable String val2) {
        return "実行結果：" + (Integer.parseInt(val1) + Integer.parseInt(val2));
    }

    //引き算
    @GetMapping("minus/{val1}/{val2}")
    public String calcMinus(@PathVariable String val1,@PathVariable String val2) {
        return "実行結果：" + (Integer.parseInt(val1) - Integer.parseInt(val2));
    }

    //掛け算
    @GetMapping("times/{val1}/{val2}")
    public String calcTimes(@PathVariable String val1,@PathVariable String val2) {
        return "実行結果：" + (Integer.parseInt(val1) * Integer.parseInt(val2));
    }

    //割り算
    @GetMapping("divide/{val1}/{val2}")
    public String calcDivide(@PathVariable String val1,@PathVariable String val2) {
        return "実行結果：" + (Integer.parseInt(val1) / Integer.parseInt(val2));
    }
}
