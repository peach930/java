package com.pubnub.api.builder.dto;

import lombok.Data;

@SuppressWarnings("checkstyle:interfaceistype")
public interface PubSubOperation {
    PubSubOperation NO_OP = new NoOpOperation();
    PubSubOperation DISCONNECT = new DisconnectOperation();
    PubSubOperation STATUS_ANNOUNCED = new ConnectedStatusAnnouncedOperation();

    @Data
    class NoOpOperation implements PubSubOperation {
        private NoOpOperation() {

        }
    }

    @Data
    class DisconnectOperation implements PubSubOperation {
        private DisconnectOperation() {

        }
    }

    @Data
    class ConnectedStatusAnnouncedOperation implements PubSubOperation {
        private ConnectedStatusAnnouncedOperation() {

        }
    }
}
