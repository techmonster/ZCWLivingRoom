package holloway.nate.ZCWLivingRoom;

/**
 * Created by nathanielholloway on 9/10/16.
 * This is the Television class.
 * Channel and volume can be set or retrieved.
 */


 class Television {

    private Integer volume;
    private Integer channel;

    Television(){
        this.volume = 0;
        this.channel = 0;
    }

    Integer getVolume(){

        return volume;
    }

    void setVolume(Integer amount){
        volume = amount;
    }

    Integer getChannel(){

        return channel;
    }

    void setChannel(Integer amount){

        channel = amount;
    }

}
