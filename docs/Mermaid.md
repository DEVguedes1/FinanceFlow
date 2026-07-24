graph LR
    User((Usuário))

    subgraph FinanceFlow [" Sistema FinanceFlow "]
        UC01["UC01: Visualizar Dashboard"]
        UC02["UC02: Listar Transações"]
        UC03["UC03: Filtrar Transações"]
        UC04["UC04: Cadastrar Transação"]
        UC05["UC05: Editar Transação"]
        UC06["UC06: Excluir Transação"]
        UC07["UC07: Gerenciar Categorias"]
        
        UC_Val["UC_VAL: Validar Campos"]
    end

    User --> UC01
    User --> UC02
    User --> UC03
    User --> UC04
    User --> UC05
    User --> UC06
    User --> UC07

    UC04 -.->|<< include >>| UC_Val