package com.biz.domain;

import java.util.List;

public class TrackBO {

    private SaleTrack track;
    private List<SaleTrack> responseTrack;

    public SaleTrack getTrack() {
        return track;
    }

    public void setTrack(SaleTrack track) {
        this.track = track;
    }

    public List<SaleTrack> getResponseTrack() {
        return responseTrack;
    }

    public void setResponseTrack(List<SaleTrack> responseTrack) {
        this.responseTrack = responseTrack;
    }
}
