package com.zhl.CBPullRefresh;

/**
 * ������ˢ��״̬�Ľӿ�
 * Created by zhaohl on 2016-3-22.
 */
public interface CBRefreshState {
    /**
     * ����ˢ��
     */
    public final static int STATE_PULL_TO_REFRESH = 0;
    /**
     * �ͷ�ˢ��
     */
    public final static int STATE_RELEASE_TO_REFRESH = 1;
    /**
     * ����ˢ��
     */
    public final static int STATE_REFRESHING = 2;
    /**
     * ��������
     */
    public final static int STATE_PULL_UP_TO_LOADMORE = 3;
    /**
     * �ͷż��ظ���
     */
    public final static int STATE_RELEASE_TO_LOADMORE = 4;

    /**
     * ����״̬
     */
    public void setState(int state);

    public void pullToRefresh();

    public void releaseToRefresh();

    /**
     * �������ظ���
     */
    public void pullUpToLoadmore();

    public void releaseToLoadmore();

    public void onRefreshing();

    public void onLoading();

    public void setVisiableHeight(int height);

    public int getVisiableHeight();

    public void onDragSlide(float deltaY);

    /**
     * ��������
     * @return
     */
    public int getLoadMorePullUpDistance();

    /**
     * ������������
     * @return
     */
    public void setLoadMorePullUpDistance(int deltaY);

    public void footerViewShow();

    public void footerViewHide();

    public int getRealHeaderContentHeight();

    public void setPullRefreshEnable(boolean enable);

    public void setLoadMoreEnable(boolean enable);

    public void setRefreshTime(String refreshTime);

    public void setHeaderIcon(int resId);

    public void onStyleChange(int state);
}
