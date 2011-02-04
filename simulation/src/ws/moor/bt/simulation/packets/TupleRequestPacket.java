/*
 * BitThief - A Free Riding BitTorrent Client
 * Copyright (C) 2006 Patrick Moor <patrick@moor.ws>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 */

package ws.moor.bt.simulation.packets;

import ws.moor.bt.simulation.Tuple;

public class TupleRequestPacket implements Packet {

  private static final int REQUEST_PACKET_SIZE = 32;

  private final Tuple tuple;

  public TupleRequestPacket(Tuple tuple) {
    this.tuple = tuple;
  }

  public Tuple getTuple() {
    return tuple;
  }

  public void accept(PacketVisitor visitor) {
    visitor.visitTupleRequestPacket(this);
  }

  public int getSizeOnWire() {
    return REQUEST_PACKET_SIZE;
  }
}
