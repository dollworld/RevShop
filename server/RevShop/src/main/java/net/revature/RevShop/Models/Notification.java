package net.revature.RevShop.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;


@Entity
@Table(name = "Notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer notificationId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @Enumerated(EnumType.STRING)
    private NotificationType type;

    public enum NotificationType {
        ORDER_PLACED,
        SHIP_ITEM,
        STOCK_ALERT,
        PRICE_CHANGE
    }

    private String content;
    private Boolean isRead;

    @CreationTimestamp
    private LocalDateTime createdAt;



}