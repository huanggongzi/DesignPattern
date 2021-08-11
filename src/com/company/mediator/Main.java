package com.company.mediator;

public class Main {
    public static void main(String[] args) {
        // 创建中介者
        UnitedNationsSecurityCouncil unitedNationsSecurityCouncil = new UnitedNationsSecurityCouncil();

        // 每个国家都接入中介者
        USA usa = new USA(unitedNationsSecurityCouncil);
        Iraq iraq = new Iraq(unitedNationsSecurityCouncil);

        // 中介者接入每个国家
        unitedNationsSecurityCouncil.setIraq(iraq);
        unitedNationsSecurityCouncil.setUsa(usa);

        // 国家发送消息
        usa.declare("美国坚决不使用核武器", iraq);
        iraq.declare("伊拉克坚决不使用核武器", usa);
    }
}
