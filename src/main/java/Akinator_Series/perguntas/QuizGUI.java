package Akinator_Series.perguntas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizGUI {

    private JFrame frame;
    private JPanel panel;
    private JButton startButton;
    private JButton nextButton;
    private int step = 0;
    private String selectedLanguage = "";
    private String selectedContinent = "";
    private String selectedGenre = "";
    private String selectedSeries = "";

    public QuizGUI() {
        frame = new JFrame("Quiz de Séries de TV");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        mostrarBoasVindas();

        frame.add(panel);
        frame.setVisible(true);
    }

    private void mostrarBoasVindas() {
        panel.removeAll();

        JLabel boasVindasLabel = new JLabel("Bem vindo ao Quiz de Séries");
        panel.add(boasVindasLabel, BorderLayout.NORTH);

        JTextArea seriesTextArea = new JTextArea(
                "- CRIMINAL MINDS\n" +
                        "- ORANGE IS THE NEW BLACK\n" +
                        "- OUTLANDER\n" +
                        "- GILMORE GIRLS\n" +
                        "- O MENTALISTA\n" +
                        "- THE BIG BANG THEORY\n" +
                        "- LUPIN\n" +
                        "- GAME OF THRONES\n" +
                        "- EU, A PATROA E AS CRIANÇAS\n" +
                        "- HANNIBAL\n" +
                        "- THE HAUNTING OF HILL HOUSE"
        );
        seriesTextArea.setEditable(false);
        panel.add(seriesTextArea, BorderLayout.CENTER);

        startButton = new JButton("Iniciar");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                step++;
                mostrarPergunta();
            }
        });
        panel.add(startButton, BorderLayout.SOUTH);

        frame.revalidate();
    }

    private void mostrarPergunta() {
        panel.removeAll();
        if (step == 1) {
            JLabel perguntaLabel = new JLabel("Escolha um idioma:");
            panel.add(perguntaLabel, BorderLayout.NORTH);

            JPanel optionsPanel = new JPanel();
            optionsPanel.setLayout(new GridLayout(3, 1));

            JButton inglesButton = new JButton("Inglês");
            inglesButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedLanguage = "Inglês";
                    step++;
                    mostrarPergunta();
                }
            });

            JButton francesButton = new JButton("Francês");
            francesButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedLanguage = "Francês";
                    step++;
                    mostrarContinente();
                }
            });

            JButton sairButton = new JButton("Sair");
            sairButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            optionsPanel.add(inglesButton);
            optionsPanel.add(francesButton);
            optionsPanel.add(sairButton);
            panel.add(optionsPanel, BorderLayout.CENTER);
        } else if (step == 2) {
            mostrarContinente();
        } else if (step == 3) {
            mostrarTipoSerie();
        } else if (step == 4) {
            mostrarGenero();
        } else if (step == 5) {
            mostrarSerie();
        } else {
            mostrarResultado();
        }

        frame.revalidate();
    }

    private void mostrarContinente() {
        panel.removeAll();
        if (selectedLanguage.equals("Francês")) {
            mostrarSerieLupin();
        } else {
            JLabel perguntaLabel = new JLabel("De qual continente é a série?");
            panel.add(perguntaLabel, BorderLayout.NORTH);

            JPanel optionsPanel = new JPanel();
            optionsPanel.setLayout(new GridLayout(3, 1));

            JButton americanoButton = new JButton("Americano");
            americanoButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedContinent = "Americano";
                    step++;
                    mostrarTipoSerie();
                }
            });

            JButton europeuButton = new JButton("Europeu");
            europeuButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedContinent = "Europeu";
                    step++;
                    mostrarTipoSerie();
                }
            });

            JButton sairButton = new JButton("Sair");
            sairButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            optionsPanel.add(americanoButton);
            optionsPanel.add(europeuButton);
            optionsPanel.add(sairButton);
            panel.add(optionsPanel, BorderLayout.CENTER);
        }

        frame.revalidate();
    }

    private void mostrarTipoSerie() {
        panel.removeAll();
        JLabel perguntaLabel = new JLabel("Qual tipo de Série?");
        panel.add(perguntaLabel, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(5, 1));

        JButton policialButton = new JButton("Policial/Investigação");
        policialButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedGenre = "Policial/Investigação";
                step++;
                mostrarGenero();
            }
        });

        JButton acaoButton = new JButton("Ação");
        acaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedGenre = "Ação";
                step++;
                mostrarGenero();
            }
        });

        JButton comediaButton = new JButton("Comédia");
        comediaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedGenre = "Comédia";
                step++;
                mostrarGenero();
            }
        });

        JButton romanceButton = new JButton("Romance");
        romanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedGenre = "Romance";
                step++;
                mostrarGenero();
            }
        });

        JButton terrorButton = new JButton("Terror");
        terrorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedGenre = "Terror";
                step++;
                mostrarGenero();
            }
        });

        optionsPanel.add(policialButton);
        optionsPanel.add(acaoButton);
        optionsPanel.add(comediaButton);
        optionsPanel.add(romanceButton);
        optionsPanel.add(terrorButton);
        panel.add(optionsPanel, BorderLayout.CENTER);

        frame.revalidate();
    }

    private void mostrarGenero() {
        panel.removeAll();
        JLabel generoLabel = new JLabel("Você escolheu: " + selectedGenre);
        panel.add(generoLabel, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(3, 1));

        if (selectedGenre.equals("Romance")) {
            JButton opcao1 = new JButton("Uma série romântica sobre um casal improvável.");
            opcao1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedSeries = "Outlander";
                    step++;
                    mostrarSerie();
                }
            });

            JButton opcao2 = new JButton("Uma série de romance que se passa em uma pequena cidade envolvendo mãe e filha.");
            opcao2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedSeries = "Gilmore Girls";
                    step++;
                    mostrarSerie();
                }
            });

            JButton sairButton = new JButton("Sair");
            sairButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            optionsPanel.add(opcao1);
            optionsPanel.add(opcao2);
            optionsPanel.add(sairButton);

        } else if (selectedGenre.equals("Policial/Investigação")) {
            JButton opcao1 = new JButton("Sobre Perfil Comportamental.");
            opcao1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedSeries = "CRIMINAL MINDS";
                    step++;
                    mostrarSerie();
                }
            });


            JButton opcao2 = new JButton("Ex-vidente.");
            opcao2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedSeries = "O MENTALISTA";
                    step++;
                    mostrarSerie();
                }
            });

            JButton sairButton = new JButton("Sair");
            sairButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            optionsPanel.add(opcao1);
            optionsPanel.add(opcao2);
            optionsPanel.add(sairButton);

        } else if (selectedGenre.equals("Ação")) {
            JButton opcao1 = new JButton("Lutas pelo trono, envolvendo várias famílias.");
            opcao1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedSeries = "GAME OF THRONES";
                    step++;
                    mostrarSerie();
                }
            });

            JButton opcao2 = new JButton("Vida das mulheres na prisão.");
            opcao2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedSeries = "ORANGE IS THE NEW BLACK";
                    step++;
                    mostrarSerie();
                }
            });

            JButton sairButton = new JButton("Sair");
            sairButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            optionsPanel.add(opcao1);
            optionsPanel.add(opcao2);
            optionsPanel.add(sairButton);

        } else if (selectedGenre.equals("Comédia")) {
            JButton opcao1 = new JButton("Grupo de amigos Nerds.");
            opcao1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedSeries = "THE BIG BANG THEORY";
                    step++;
                    mostrarSerie();
                }
            });

            JButton opcao2 = new JButton("Sobre uma família que o pai cuida e protege seus filhos e esposa.");
            opcao2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedSeries = "EU, A PATROA DAS CRIANÇAS";
                    step++;
                    mostrarSerie();
                }
            });

            JButton sairButton = new JButton("Sair");
            sairButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            optionsPanel.add(opcao1);
            optionsPanel.add(opcao2);
            optionsPanel.add(sairButton);
        } else if (selectedGenre.equals("Terror")) {
            JButton opcao1 = new JButton("Uma série de terror sobrenatural com fantasmas.");
            opcao1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedSeries = "The Haunting of Hill House";
                    step++;
                    mostrarSerie();
                }
            });

            JButton opcao2 = new JButton("Uma série de terror psicológico e suspense.");
            opcao2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    selectedSeries = "Hannibal";
                    step++;
                    mostrarSerie();
                }
            });

            JButton sairButton = new JButton("Sair");
            sairButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            optionsPanel.add(opcao1);
            optionsPanel.add(opcao2);
            optionsPanel.add(sairButton);
        }

        panel.add(optionsPanel, BorderLayout.CENTER);
        frame.revalidate();
    }

    private void mostrarSerie() {
        panel.removeAll();
        JLabel serieLabel = new JLabel("Você escolheu a série: " + selectedSeries);
        panel.add(serieLabel, BorderLayout.NORTH);

        JButton resultadoButton = new JButton("Resultado");
        resultadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarResultado();
            }
        });

        panel.add(resultadoButton, BorderLayout.CENTER);
        frame.revalidate();
    }

    private void mostrarResultado() {
        panel.removeAll();
        JLabel resultadoLabel = new JLabel("Parabéns! Você completou o Quiz.");
        panel.add(resultadoLabel, BorderLayout.NORTH);

        JButton reiniciarButton = new JButton("Reiniciar");
        reiniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                step = 0;
                mostrarBoasVindas();
            }
        });

        panel.add(reiniciarButton, BorderLayout.CENTER);
        frame.revalidate();
    }

    private void mostrarSerieLupin() {
        JLabel lupinLabel = new JLabel("Você escolheu 'Lupin'");
        panel.add(lupinLabel, BorderLayout.CENTER);
        frame.revalidate();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuizGUI();
            }
        });
    }

}
