package warCardGame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class WarWindow {

	private JFrame frame;
	private Deck deck;
	private JLabel player_Card;
	private Deck Second_deck;
	private JLabel player_Card_1;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WarWindow window = new WarWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WarWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		player_Card = new JLabel("");
		player_Card.setOpaque(true);
		player_Card.setBackground(new Color(0, 0, 0));
		player_Card.setBounds(10, 66, 99, 144);
		frame.getContentPane().add(player_Card);
		
			JButton btnNewButton = new JButton("Draw Button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Card player_card = deck.drawCard();
					Card opp_card = Second_deck.drawCard();
					player_Card.setIcon(player_card.getImg());
					player_Card_1.setIcon(opp_card.getImg());
					if(player_card.value > opp_card.value) {
						System.out.println("Player Won!");
					}else if(player_card.value < opp_card.value){
						System.out.println("Player Lost!");
					}else {
						System.out.println("Player tied!");
					}
				

				
				Card randomCard;
				randomCard = deck.drawCard();
				randomCard = Second_deck.drawCard();
				player_Card.setIcon(randomCard.getImg());
				player_Card_1.setIcon(randomCard.getImg());
				System.out.println(randomCard.toString());
			}
		});
		btnNewButton.setBounds(323, 122, 105, 23);
		frame.getContentPane().add(btnNewButton);
		
		player_Card_1 = new JLabel("");
		player_Card_1.setOpaque(true);
		player_Card_1.setBackground(Color.BLACK);
		player_Card_1.setBounds(186, 66, 99, 144);
		frame.getContentPane().add(player_Card_1);
		deck = new Deck();
		deck.createDeck();
		deck.shuffle();
		Second_deck = new Deck();
		Second_deck.createDeck();
		Second_deck.shuffle();
	}
}
