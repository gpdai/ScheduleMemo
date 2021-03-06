package jp.co.abs.schedule;

import androidx.annotation.Nullable;

public class Schedule {
    private String mMinuteText;
    private String mHourText;
    private String mScheduleText;
    private int mRequestCode;
    private ScheduleGenre mScheduleGenre;

    public Schedule(String minuteText, String hourText, String scheduleText, int requestCode, ScheduleGenre scheduleGenre) {
        mMinuteText = zeroPadding(minuteText);
        mHourText = zeroPadding(hourText);
        mScheduleText = scheduleText;
        mRequestCode = requestCode;
        mScheduleGenre = scheduleGenre;
    }

    public String getMinuteText() {
        return mMinuteText;
    }

    public String getHourText() {
        return mHourText;
    }

    public String getScheduleText() {
        return mScheduleText;
    }

    public int getRequestCode() {
        return mRequestCode;
    }

    public ScheduleGenre getScheduleGenre() {
        return mScheduleGenre;
    }

    public String getTimeText() {
        return getHourText() + ":" + getMinuteText();
    }

    private String zeroPadding(String timeText) {
        if (timeText.length() == 1) {
            return "0" + timeText;
        }
        return timeText;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Schedule) {
            Schedule schedule = (Schedule) obj;
            if (getHourText().equals(schedule.getHourText()) &&
                    getMinuteText().equals(schedule.getMinuteText()) &&
                    getScheduleText().equals(schedule.getScheduleText())) {
                return true;
            }
        }
        return super.equals(obj);
    }
}
