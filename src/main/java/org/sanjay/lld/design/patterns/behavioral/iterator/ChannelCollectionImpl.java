package org.sanjay.lld.design.patterns.behavioral.iterator;

import java.util.List;
import java.util.ArrayList;

public class ChannelCollectionImpl implements ChannelCollection {
    private List<Channel> channelList;

    public ChannelCollectionImpl() {
        channelList = new ArrayList<>();
    }

    public void addChannel(Channel channel) {
        channelList.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        channelList.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channelList);
    }

    private class ChannelIteratorImpl implements ChannelIterator {
        private ChannelTypeEnum type;
        private List<Channel> channels;
        private int position;
        public ChannelIteratorImpl(ChannelTypeEnum type , List<Channel> channelList) {
            this.type = type;
            this.channels = channelList;
        }
        @Override
        public boolean hasNext() {
            while(position < channels.size()) {
                Channel c = channels.get(position);
                if(c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                    return true;
                } else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position++;
            return c;
        }
    }
}
