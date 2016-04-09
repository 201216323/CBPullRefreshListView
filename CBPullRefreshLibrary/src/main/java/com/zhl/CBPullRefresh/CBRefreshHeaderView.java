package com.zhl.CBPullRefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public  class CBRefreshHeaderView extends LinearLayout implements CBRefreshState {
    private Context context;
    public CBRefreshHeaderView(Context context) {
        this(context, null);
    }

    public CBRefreshHeaderView(Context context, AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public CBRefreshHeaderView(Context context, AttributeSet attrs,
                               int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    /**
     * ���õ�ǰ״̬
     * @param state
     */
    @Override
    public void setState(int state) {

    }

    /**
     * ����ˢ�µĻص�
     */
    @Override
    public void pullToRefresh() {

    }

    /**
     * �ͷ�ˢ�µĻص�
     */
    @Override
    public void releaseToRefresh() {

    }


    /**
     * �������ظ���
     */
    @Override
    public void pullUpToLoadmore() {

    }

    /**
     * �ͷż��ظ���
     */
    @Override
    public void releaseToLoadmore() {

    }

    /**
     * ����ˢ��
     */
    @Override
    public void onRefreshing() {

    }

    @Override
    public void onLoading() {

    }

    /**
     * ����ͷ����ײ��Ŀɼ��߶�
     * @param height
     */
    @Override
    public void setVisiableHeight(int height) {

    }

    /**
     * ��ȡ�ɼ��߶�
     * @return
     */
    @Override
    public int getVisiableHeight() {
        return 0;
    }

    /**
     * �����϶�
     * @param deltaY
     */
    @Override
    public void onDragSlide(float deltaY) {

    }
    /**
     * ��ȡ�����ײ�����������
     */
    @Override
    public int getLoadMorePullUpDistance() {
        return 0;
    }
    /**
     * ���������ײ�����������
     */
    @Override
    public void setLoadMorePullUpDistance(int deltaY) {

    }
    /**
     * ��ʾ�ײ�view
     */
    @Override
    public void footerViewShow() {

    }
    /**
     * ���صײ�view
     */
    @Override
    public void footerViewHide() {

    }
    /**
     * ��ȡͷ������ʵ���ݸ߶�
     */
    @Override
    public int getRealHeaderContentHeight() {
        return 0;
    }
    /**
     * ���������Ƿ����
     */
    @Override
    public void setPullRefreshEnable(boolean enable) {

    }
    /**
     * ���������Ƿ����
     */
    @Override
    public void setLoadMoreEnable(boolean enable) {

    }

    @Override
    public void setRefreshTime(String refreshTime) {

    }

    @Override
    public void setHeaderIcon(int resId) {

    }

    @Override
    public void onStyleChange(int state) {

    }

    protected String getString(int redID){
       return context.getString(redID);
    }


}
