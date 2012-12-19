package com.rakuten.rit.roma.romac4j;

import java.util.concurrent.TimeoutException;

import com.rakuten.rit.roma.romac4j.pool.Connection;

public class StringReceiver extends Receiver {

    String str;
    
    @Override
    void receive(Connection con) throws TimeoutException {
        // TODO Auto-generated method stub
        str = con.readLine();
    }

    public String toString(){
        return str;
    }
}
