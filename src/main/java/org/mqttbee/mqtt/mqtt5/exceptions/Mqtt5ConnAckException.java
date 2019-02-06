/*
 * Copyright 2018 The MQTT Bee project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.mqttbee.mqtt.mqtt5.exceptions;

import org.jetbrains.annotations.NotNull;
import org.mqttbee.mqtt.mqtt5.message.connect.connack.Mqtt5ConnAck;

/**
 * @author Silvio Giebl
 * @since 1.0
 */
public class Mqtt5ConnAckException extends Mqtt5MessageException {

    private final @NotNull Mqtt5ConnAck connAck;

    public Mqtt5ConnAckException(final @NotNull Mqtt5ConnAck connAck, final @NotNull String message) {
        super(message);
        this.connAck = connAck;
    }

    @Override
    public @NotNull Mqtt5ConnAck getMqttMessage() {
        return connAck;
    }
}
