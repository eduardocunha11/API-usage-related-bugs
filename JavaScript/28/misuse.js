function checkDates()
{
    date = new Date();
    if (date.getMonth() >= 8){
        if (date.getDate() >= 26 || date.getMonth() > 8)
            $(".final_presentation_upload").html("Sept 25, 2012");
    }
    if (date.getMonth() >= 9){
        if (date.getDate() >= 1 || date.getMonth() > 9)
            $(".conference_dates").html("Conference");
    }
}
checkDates();
