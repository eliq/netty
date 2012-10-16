/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.handler.codec;

/**
 * An {@link Exception} which is thrown by an encoder.
 *
 * @apiviz.hidden
 */
public class DecoderException extends CodecException {

    private static final long serialVersionUID = 6926716840699621852L;

    /**
     * Creates a new instance.
     */
    public DecoderException() {
    }

    /**
     * Creates a new instance.
     */
    public DecoderException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Creates a new instance.
     */
    public DecoderException(String message) {
        super(message);
    }

    /**
     * Creates a new instance.
     */
    public DecoderException(Throwable cause) {
        super(cause);
    }
}