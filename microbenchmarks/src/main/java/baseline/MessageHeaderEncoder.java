/*
 *     Copyright (C) 2015  higherfrequencytrading.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/* Generated SBE (Simple Binary Encoding) message codec */
package baseline;

import uk.co.real_logic.agrona.MutableDirectBuffer;
import uk.co.real_logic.sbe.codec.java.CodecUtil;

public class MessageHeaderEncoder {
    public static final int ENCODED_LENGTH = 8;
    private MutableDirectBuffer buffer;
    private int offset;

    public static int blockLengthNullValue() {
        return 65535;
    }

    public static int blockLengthMinValue() {
        return 0;
    }

    public static int blockLengthMaxValue() {
        return 65534;
    }

    public static int templateIdNullValue() {
        return 65535;
    }

    public static int templateIdMinValue() {
        return 0;
    }

    public static int templateIdMaxValue() {
        return 65534;
    }

    public static int schemaIdNullValue() {
        return 65535;
    }

    public static int schemaIdMinValue() {
        return 0;
    }

    public static int schemaIdMaxValue() {
        return 65534;
    }

    public static int versionNullValue() {
        return 65535;
    }

    public static int versionMinValue() {
        return 0;
    }

    public static int versionMaxValue() {
        return 65534;
    }

    public MessageHeaderEncoder wrap(final MutableDirectBuffer buffer, final int offset) {
        this.buffer = buffer;
        this.offset = offset;
        return this;
    }

    public int encodedLength() {
        return ENCODED_LENGTH;
    }

    public MessageHeaderEncoder blockLength(final int value) {
        CodecUtil.uint16Put(buffer, offset + 0, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public MessageHeaderEncoder templateId(final int value) {
        CodecUtil.uint16Put(buffer, offset + 2, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public MessageHeaderEncoder schemaId(final int value) {
        CodecUtil.uint16Put(buffer, offset + 4, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public MessageHeaderEncoder version(final int value) {
        CodecUtil.uint16Put(buffer, offset + 6, value, java.nio.ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
