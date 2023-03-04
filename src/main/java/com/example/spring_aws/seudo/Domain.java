package com.example.spring_aws.seudo;

import org.springframework.transaction.annotation.Transactional;

public class Domain {

//    @Transactional
//    public Order cancelOrder(int orderId){
//        1) 데이터베이스로부터 주문정보(Orders), 결제정보(Builling), 배송정보(Delivery) 조회;
//        2) 배송 취소를 해야 하는지 확인;
//        3) If(배송중이라면){
//            배송 취소로 변경
//        }
//        4) 각 테이블에 취소 상태 Update
//    }

//    @Transactional
//    public Order cancelOrder(knt orderId){
//
//        1)
//        OrdersDto order = ordersDao.selectOrders(orderId);
//        BillingDto billing = billingDao.selectBilling(orderId);
//        DeliverDto delivery = deliveryDao.selectDelivery(orderId);
//
//        2)
//        String deliveryStatus = delivery.getStatus();
//
//        3)
//        if("IN_PROGRESS".equals(deliveryStatus)){
//            delivery.setStatus("CANCEL");
//            deliveryDao.update("delivery");
//        }
//
//        4)
//        order.setStatus("CANCEL");
//        orderDao.update(order);
//
//        billing.setStatus("CANCEL");
//        deliveryDao.update(billing);
//
//        return order;
//    }

//    @Transactional
//    public Order cancelOrder(int orderId){
//
//        1)
//        Orders order = orderRepository.findById(orderId);
//        Billing billing = billingRepository.findByOrderId(orderId);
//        Delivery delivery = deliveryRepository.findByOrderId(orderId);
//
//        // orderId를 이용해서 order, billing, delivery 모두 찾아냄
//
//        2-3)
//        delivery.cancel;
//
//        4)
//        order.cancel();
//        billing.cancel();
//
//        return order;
//    }
}
